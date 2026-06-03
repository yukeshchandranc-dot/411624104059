import socket

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)


client.connect(("localhost", 12345))

while True:
    
    msg = input("You: ")
    client.send(msg.encode())

    if msg.lower() == "exit":
        break

    
    reply = client.recv(1024).decode()
    if reply.lower() == "exit":
        print("Server disconnected")
        break
    print("Server:", reply)

client.close()