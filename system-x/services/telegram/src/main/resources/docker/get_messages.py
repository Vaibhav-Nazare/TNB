import os, sys, json

from telethon.sync import TelegramClient
from telethon.sessions import StringSession

def transform(message):
    return {'sender_id': message.sender_id, 'text': message.text, 'chat_id': message.chat.id}

def get_msgs(api_id, api_hash, session_str, username):
    client = TelegramClient(StringSession(session_str), api_id, api_hash)
    limit = 1
    if (len(sys.argv) == 2):
        limit = int(sys.argv[1])
    with client:
        print(json.dumps(list(map(transform, client.get_messages(username, limit)))))

if __name__ == '__main__':
    arg_api_id = int(os.environ["TELEGRAM_API_ID"])
    arg_api_hash = os.environ["TELEGRAM_API_HASH"]
    arg_session_str = os.environ["TELEGRAM_SESSION"]
    arg_username = os.environ["TELEGRAM_USERNAME"]

    get_msgs(arg_api_id, arg_api_hash, arg_session_str, arg_username)
