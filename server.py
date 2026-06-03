import socket


server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)


server.bind(("localhost", 12345))


server.listen(1)
print("Server is waiting for connection...")

conn, addr = server.accept()
print("Connected to:", addr)

while True:
    
    msg = conn.recv(1024).decode()
    if msg.lower() == "exit":
        print("Client disconnected")
        break
    print("Client:", msg)

    
    reply = input("You: ")
    conn.send(reply.encode())

    if reply.lower() == "exit":
        break

conn.close()
server.close()