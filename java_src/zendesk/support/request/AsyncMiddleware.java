package zendesk.support.request;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import zendesk.support.suas.Action;
import zendesk.support.suas.Continuation;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;
import zendesk.support.suas.Middleware;
/* loaded from: classes8.dex */
class AsyncMiddleware implements Middleware {
    private static final String ACTION_TYPE = "async_action";
    private static final String LOG_TAG = "AsyncMiddleware";
    private final Queue queue;

    /* loaded from: classes8.dex */
    public interface AsyncAction {
        void actionQueued(Dispatcher dispatcher, GetState getState);

        void execute(Dispatcher dispatcher, GetState getState, Callback callback);
    }

    /* loaded from: classes8.dex */
    public interface Callback {
        void done();
    }

    /* loaded from: classes8.dex */
    public interface Item {
        void execute(Callback callback);
    }

    /* loaded from: classes8.dex */
    public static class QueueItem implements Item {
        private final AsyncAction asyncAction;
        private final Dispatcher dispatcher;
        private final GetState getState;

        @Override // zendesk.support.request.AsyncMiddleware.Item
        public void execute(Callback callback) {
            this.asyncAction.execute(this.dispatcher, this.getState, callback);
        }

        private QueueItem(AsyncAction asyncAction, GetState getState, Dispatcher dispatcher) {
            this.asyncAction = asyncAction;
            this.getState = getState;
            this.dispatcher = dispatcher;
        }
    }

    public AsyncMiddleware(Queue queue) {
        this.queue = queue;
    }

    public static Action createAction(AsyncAction asyncAction) {
        return new Action(ACTION_TYPE, asyncAction);
    }

    @Override // zendesk.support.suas.Middleware
    public void onAction(Action<?> action, GetState getState, Dispatcher dispatcher, Continuation continuation) {
        AsyncAction asyncAction = (AsyncAction) action.getData(AsyncAction.class);
        if (asyncAction != null) {
            asyncAction.actionQueued(dispatcher, getState);
            this.queue.dispatch(new QueueItem(asyncAction, getState, dispatcher));
            return;
        }
        continuation.next(action);
    }

    /* loaded from: classes8.dex */
    public static class Queue {
        private final Callback dispatchCallback;
        private final AtomicBoolean isRunning;
        private final java.util.Queue<Item> items;

        /* loaded from: classes8.dex */
        public class QueueCallback implements Callback {
            private QueueCallback() {
            }

            @Override // zendesk.support.request.AsyncMiddleware.Callback
            public void done() {
                synchronized (Queue.this.items) {
                    Item item = (Item) Queue.this.items.poll();
                }
                Queue.this.dispatchInternal();
            }
        }

        public Queue() {
            this.items = new LinkedList();
            this.isRunning = new AtomicBoolean(false);
            this.dispatchCallback = new QueueCallback();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void dispatchInternal() {
            Item item;
            synchronized (this.items) {
                if (!this.items.isEmpty()) {
                    item = this.items.peek();
                } else {
                    this.isRunning.set(false);
                    item = null;
                }
            }
            if (item != null) {
                item.execute(this.dispatchCallback);
            }
        }

        public void dispatch(Item item) {
            if (item == null) {
                return;
            }
            synchronized (this.items) {
                this.items.add(item);
            }
            if (this.isRunning.compareAndSet(false, true)) {
                dispatchInternal();
            }
        }

        public boolean isRunning() {
            return this.isRunning.get();
        }

        public Queue(LinkedList<Item> linkedList) {
            this.items = linkedList;
            this.isRunning = new AtomicBoolean(false);
            this.dispatchCallback = new QueueCallback();
        }
    }
}
