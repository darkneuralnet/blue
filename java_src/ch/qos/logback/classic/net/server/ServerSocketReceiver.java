package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.net.ReceiverBase;
import ch.qos.logback.core.net.AbstractSocketAppender;
import ch.qos.logback.core.net.server.ServerListener;
import ch.qos.logback.core.net.server.ServerRunner;
import ch.qos.logback.core.util.CloseUtil;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.concurrent.Executor;
import javax.net.ServerSocketFactory;
/* loaded from: classes.dex */
public class ServerSocketReceiver extends ReceiverBase {
    public static final int DEFAULT_BACKLOG = 50;
    private String address;
    private ServerRunner runner;
    private int port = AbstractSocketAppender.DEFAULT_PORT;
    private int backlog = 50;

    public ServerListener<RemoteAppenderClient> createServerListener(ServerSocket serverSocket) {
        return new RemoteAppenderServerListener(serverSocket);
    }

    public ServerRunner createServerRunner(ServerListener<RemoteAppenderClient> serverListener, Executor executor) {
        return new RemoteAppenderServerRunner(serverListener, executor);
    }

    public String getAddress() {
        return this.address;
    }

    public int getBacklog() {
        return this.backlog;
    }

    public InetAddress getInetAddress() throws UnknownHostException {
        if (getAddress() == null) {
            return null;
        }
        return InetAddress.getByName(getAddress());
    }

    public int getPort() {
        return this.port;
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public Runnable getRunnableTask() {
        return this.runner;
    }

    public ServerSocketFactory getServerSocketFactory() throws Exception {
        return ServerSocketFactory.getDefault();
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public void onStop() {
        try {
            ServerRunner serverRunner = this.runner;
            if (serverRunner == null) {
                return;
            }
            serverRunner.stop();
        } catch (IOException e) {
            addError("server shutdown error: " + e, e);
        }
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setBacklog(int i) {
        this.backlog = i;
    }

    public void setPort(int i) {
        this.port = i;
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    public boolean shouldStart() {
        ServerSocket serverSocket = null;
        try {
            serverSocket = getServerSocketFactory().createServerSocket(getPort(), getBacklog(), getInetAddress());
            ServerRunner createServerRunner = createServerRunner(createServerListener(serverSocket), getContext().getScheduledExecutorService());
            this.runner = createServerRunner;
            createServerRunner.setContext(getContext());
            return true;
        } catch (Exception e) {
            addError("server startup error: " + e, e);
            CloseUtil.closeQuietly(serverSocket);
            return false;
        }
    }
}
