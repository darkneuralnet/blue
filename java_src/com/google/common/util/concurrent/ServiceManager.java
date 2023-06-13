package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Service;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.C39820dZ1;
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class ServiceManager implements ServiceManagerBridge {
    private final VY1<Service> services;
    private final ServiceManagerState state;
    private static final Logger logger = Logger.getLogger(ServiceManager.class.getName());
    private static final ListenerCallQueue.Event<Listener> HEALTHY_EVENT = new ListenerCallQueue.Event<Listener>() { // from class: com.google.common.util.concurrent.ServiceManager.1
        public String toString() {
            return "healthy()";
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(Listener listener) {
            listener.healthy();
        }
    };
    private static final ListenerCallQueue.Event<Listener> STOPPED_EVENT = new ListenerCallQueue.Event<Listener>() { // from class: com.google.common.util.concurrent.ServiceManager.2
        public String toString() {
            return "stopped()";
        }

        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        public void call(Listener listener) {
            listener.stopped();
        }
    };

    /* loaded from: classes6.dex */
    public static final class EmptyServiceManagerWarning extends Throwable {
        private EmptyServiceManagerWarning() {
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class Listener {
        public void failure(Service service) {
        }

        public void healthy() {
        }

        public void stopped() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class NoOpService extends AbstractService {
        private NoOpService() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStart() {
            notifyStarted();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStop() {
            notifyStopped();
        }
    }

    /* loaded from: classes6.dex */
    public static final class ServiceListener extends Service.Listener {
        final Service service;
        final WeakReference<ServiceManagerState> state;

        public ServiceListener(Service service, WeakReference<ServiceManagerState> weakReference) {
            this.service = service;
            this.state = weakReference;
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void failed(Service.State state, Throwable th) {
            ServiceManagerState serviceManagerState = this.state.get();
            if (serviceManagerState != null) {
                if (!(this.service instanceof NoOpService)) {
                    Logger logger = ServiceManager.logger;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(this.service);
                    String valueOf2 = String.valueOf(state);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 34 + valueOf2.length());
                    sb.append("Service ");
                    sb.append(valueOf);
                    sb.append(" has failed in the ");
                    sb.append(valueOf2);
                    sb.append(" state.");
                    logger.log(level, sb.toString(), th);
                }
                serviceManagerState.transitionService(this.service, state, Service.State.FAILED);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void running() {
            ServiceManagerState serviceManagerState = this.state.get();
            if (serviceManagerState != null) {
                serviceManagerState.transitionService(this.service, Service.State.STARTING, Service.State.RUNNING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void starting() {
            ServiceManagerState serviceManagerState = this.state.get();
            if (serviceManagerState != null) {
                serviceManagerState.transitionService(this.service, Service.State.NEW, Service.State.STARTING);
                if (!(this.service instanceof NoOpService)) {
                    ServiceManager.logger.log(Level.FINE, "Starting {0}.", this.service);
                }
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void stopping(Service.State state) {
            ServiceManagerState serviceManagerState = this.state.get();
            if (serviceManagerState != null) {
                serviceManagerState.transitionService(this.service, state, Service.State.STOPPING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void terminated(Service.State state) {
            ServiceManagerState serviceManagerState = this.state.get();
            if (serviceManagerState != null) {
                if (!(this.service instanceof NoOpService)) {
                    ServiceManager.logger.log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.service, state});
                }
                serviceManagerState.transitionService(this.service, state, Service.State.TERMINATED);
            }
        }
    }

    public ServiceManager(Iterable<? extends Service> iterable) {
        boolean z;
        VY1<Service> m79768x = VY1.m79768x(iterable);
        if (m79768x.isEmpty()) {
            logger.log(Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", (Throwable) new EmptyServiceManagerWarning());
            m79768x = VY1.m79780F(new NoOpService());
        }
        ServiceManagerState serviceManagerState = new ServiceManagerState(m79768x);
        this.state = serviceManagerState;
        this.services = m79768x;
        WeakReference weakReference = new WeakReference(serviceManagerState);
        AbstractC48175re6<Service> it = m79768x.iterator();
        while (it.hasNext()) {
            Service next = it.next();
            next.addListener(new ServiceListener(next, weakReference), MoreExecutors.directExecutor());
            if (next.state() == Service.State.NEW) {
                z = true;
            } else {
                z = false;
            }
            EZ3.m108805j(z, "Can only manage NEW services, %s", next);
        }
        this.state.markReady();
    }

    public void addListener(Listener listener, Executor executor) {
        this.state.addListener(listener, executor);
    }

    public void awaitHealthy() {
        this.state.awaitHealthy();
    }

    public void awaitStopped() {
        this.state.awaitStopped();
    }

    public boolean isHealthy() {
        AbstractC48175re6<Service> it = this.services.iterator();
        while (it.hasNext()) {
            if (!it.next().isRunning()) {
                return false;
            }
        }
        return true;
    }

    public ServiceManager startAsync() {
        boolean z;
        AbstractC48175re6<Service> it = this.services.iterator();
        while (it.hasNext()) {
            if (it.next().state() == Service.State.NEW) {
                z = true;
            } else {
                z = false;
            }
            EZ3.m108792w(z, "Not all services are NEW, cannot start %s", this);
        }
        AbstractC48175re6<Service> it2 = this.services.iterator();
        while (it2.hasNext()) {
            Service next = it2.next();
            try {
                this.state.tryStartTiming(next);
                next.startAsync();
            } catch (IllegalStateException e) {
                Logger logger2 = logger;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(next);
                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                sb.append("Unable to start Service ");
                sb.append(valueOf);
                logger2.log(level, sb.toString(), (Throwable) e);
            }
        }
        return this;
    }

    public XY1<Service, Long> startupTimes() {
        return this.state.startupTimes();
    }

    public ServiceManager stopAsync() {
        AbstractC48175re6<Service> it = this.services.iterator();
        while (it.hasNext()) {
            it.next().stopAsync();
        }
        return this;
    }

    public String toString() {
        return KV2.m98827b(ServiceManager.class).m98824b("services", C44098km0.m28479b(this.services, JZ3.m100194i(JZ3.m100196g(NoOpService.class)))).toString();
    }

    /* loaded from: classes6.dex */
    public static final class ServiceManagerState {
        final Monitor.Guard awaitHealthGuard;
        final ListenerCallQueue<Listener> listeners;
        final Monitor monitor = new Monitor();
        final int numberOfServices;
        boolean ready;
        final InterfaceC37423Yv5<Service.State, Service> servicesByState;
        final Map<Service, YQ5> startupTimers;
        final InterfaceC45139mX2<Service.State> states;
        final Monitor.Guard stoppedGuard;
        boolean transitioned;

        /* loaded from: classes6.dex */
        public final class AwaitHealthGuard extends Monitor.Guard {
            public AwaitHealthGuard() {
                super(ServiceManagerState.this.monitor);
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            public boolean isSatisfied() {
                int mo20918d3 = ServiceManagerState.this.states.mo20918d3(Service.State.RUNNING);
                ServiceManagerState serviceManagerState = ServiceManagerState.this;
                if (mo20918d3 != serviceManagerState.numberOfServices && !serviceManagerState.states.contains(Service.State.STOPPING) && !ServiceManagerState.this.states.contains(Service.State.TERMINATED) && !ServiceManagerState.this.states.contains(Service.State.FAILED)) {
                    return false;
                }
                return true;
            }
        }

        /* loaded from: classes6.dex */
        public final class StoppedGuard extends Monitor.Guard {
            public StoppedGuard() {
                super(ServiceManagerState.this.monitor);
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            public boolean isSatisfied() {
                return ServiceManagerState.this.states.mo20918d3(Service.State.TERMINATED) + ServiceManagerState.this.states.mo20918d3(Service.State.FAILED) == ServiceManagerState.this.numberOfServices;
            }
        }

        public ServiceManagerState(QY1<Service> qy1) {
            InterfaceC37423Yv5<Service.State, Service> mo33838b = AbstractC42767iX2.m33843a(Service.State.class).m33840b().mo33838b();
            this.servicesByState = mo33838b;
            this.states = mo33838b.mo39190d();
            this.startupTimers = C37907aM2.m71550l();
            this.awaitHealthGuard = new AwaitHealthGuard();
            this.stoppedGuard = new StoppedGuard();
            this.listeners = new ListenerCallQueue<>();
            this.numberOfServices = qy1.size();
            mo33838b.mo39189e(Service.State.NEW, qy1);
        }

        public void addListener(Listener listener, Executor executor) {
            this.listeners.addListener(listener, executor);
        }

        public void awaitHealthy() {
            this.monitor.enterWhenUninterruptibly(this.awaitHealthGuard);
            try {
                checkHealthy();
            } finally {
                this.monitor.leave();
            }
        }

        public void awaitStopped() {
            this.monitor.enterWhenUninterruptibly(this.stoppedGuard);
            this.monitor.leave();
        }

        public void checkHealthy() {
            InterfaceC45139mX2<Service.State> interfaceC45139mX2 = this.states;
            Service.State state = Service.State.RUNNING;
            if (interfaceC45139mX2.mo20918d3(state) == this.numberOfServices) {
                return;
            }
            String valueOf = String.valueOf(C43360jX2.m30370c(this.servicesByState, JZ3.m100194i(JZ3.m100198e(state))));
            StringBuilder sb = new StringBuilder(valueOf.length() + 79);
            sb.append("Expected to be healthy after starting. The following services are not running: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }

        public void dispatchListenerEvents() {
            EZ3.m108794u(!this.monitor.isOccupiedByCurrentThread(), "It is incorrect to execute listeners with the monitor held.");
            this.listeners.dispatch();
        }

        public void enqueueFailedEvent(final Service service) {
            this.listeners.enqueue(new ListenerCallQueue.Event<Listener>(this) { // from class: com.google.common.util.concurrent.ServiceManager.ServiceManagerState.2
                public String toString() {
                    String valueOf = String.valueOf(service);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                    sb.append("failed({service=");
                    sb.append(valueOf);
                    sb.append("})");
                    return sb.toString();
                }

                @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
                public void call(Listener listener) {
                    listener.failure(service);
                }
            });
        }

        public void enqueueHealthyEvent() {
            this.listeners.enqueue(ServiceManager.HEALTHY_EVENT);
        }

        public void enqueueStoppedEvent() {
            this.listeners.enqueue(ServiceManager.STOPPED_EVENT);
        }

        public void markReady() {
            this.monitor.enter();
            try {
                if (!this.transitioned) {
                    this.ready = true;
                    return;
                }
                ArrayList m93255g = C34819Ns2.m93255g();
                AbstractC48175re6<Service> it = servicesByState().m74902z().iterator();
                while (it.hasNext()) {
                    Service next = it.next();
                    if (next.state() != Service.State.NEW) {
                        m93255g.add(next);
                    }
                }
                String valueOf = String.valueOf(m93255g);
                StringBuilder sb = new StringBuilder(valueOf.length() + 89);
                sb.append("Services started transitioning asynchronously before the ServiceManager was constructed: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } finally {
                this.monitor.leave();
            }
        }

        public C39820dZ1<Service.State, Service> servicesByState() {
            C39820dZ1.C19793a m44136A = C39820dZ1.m44136A();
            this.monitor.enter();
            try {
                for (Map.Entry<Service.State, Service> entry : this.servicesByState.mo24584b()) {
                    if (!(entry.getValue() instanceof NoOpService)) {
                        m44136A.m44121f(entry);
                    }
                }
                this.monitor.leave();
                return m44136A.m44123d();
            } catch (Throwable th) {
                this.monitor.leave();
                throw th;
            }
        }

        public XY1<Service, Long> startupTimes() {
            this.monitor.enter();
            try {
                ArrayList m93252j = C34819Ns2.m93252j(this.startupTimers.size());
                for (Map.Entry<Service, YQ5> entry : this.startupTimers.entrySet()) {
                    Service key = entry.getKey();
                    YQ5 value = entry.getValue();
                    if (!value.m75078f() && !(key instanceof NoOpService)) {
                        m93252j.add(C37907aM2.m71555g(key, Long.valueOf(value.m75080d(TimeUnit.MILLISECONDS))));
                    }
                }
                this.monitor.leave();
                Collections.sort(m93252j, AbstractC53114zy3.m58c().m56e(new InterfaceC50859wA1<Map.Entry<Service, Long>, Long>(this) { // from class: com.google.common.util.concurrent.ServiceManager.ServiceManagerState.1
                    @Override // p000.InterfaceC50859wA1
                    public Long apply(Map.Entry<Service, Long> entry2) {
                        return entry2.getValue();
                    }
                }));
                return XY1.m76887b(m93252j);
            } catch (Throwable th) {
                this.monitor.leave();
                throw th;
            }
        }

        public void transitionService(Service service, Service.State state, Service.State state2) {
            boolean z;
            EZ3.m108801n(service);
            if (state != state2) {
                z = true;
            } else {
                z = false;
            }
            EZ3.m108811d(z);
            this.monitor.enter();
            try {
                this.transitioned = true;
                if (!this.ready) {
                    return;
                }
                EZ3.m108791x(this.servicesByState.remove(state, service), "Service %s not at the expected location in the state map %s", service, state);
                EZ3.m108791x(this.servicesByState.put(state2, service), "Service %s in the state map unexpectedly at %s", service, state2);
                YQ5 yq5 = this.startupTimers.get(service);
                if (yq5 == null) {
                    yq5 = YQ5.m75081c();
                    this.startupTimers.put(service, yq5);
                }
                Service.State state3 = Service.State.RUNNING;
                if (state2.compareTo(state3) >= 0 && yq5.m75078f()) {
                    yq5.m75076h();
                    if (!(service instanceof NoOpService)) {
                        ServiceManager.logger.log(Level.FINE, "Started {0} in {1}.", new Object[]{service, yq5});
                    }
                }
                Service.State state4 = Service.State.FAILED;
                if (state2 == state4) {
                    enqueueFailedEvent(service);
                }
                if (this.states.mo20918d3(state3) == this.numberOfServices) {
                    enqueueHealthyEvent();
                } else if (this.states.mo20918d3(Service.State.TERMINATED) + this.states.mo20918d3(state4) == this.numberOfServices) {
                    enqueueStoppedEvent();
                }
            } finally {
                this.monitor.leave();
                dispatchListenerEvents();
            }
        }

        public void tryStartTiming(Service service) {
            this.monitor.enter();
            try {
                if (this.startupTimers.get(service) == null) {
                    this.startupTimers.put(service, YQ5.m75081c());
                }
            } finally {
                this.monitor.leave();
            }
        }

        public void awaitStopped(long j, TimeUnit timeUnit) throws TimeoutException {
            this.monitor.enter();
            try {
                if (this.monitor.waitForUninterruptibly(this.stoppedGuard, j, timeUnit)) {
                    return;
                }
                String valueOf = String.valueOf(C43360jX2.m30370c(this.servicesByState, JZ3.m100194i(JZ3.m100197f(EnumSet.of(Service.State.TERMINATED, Service.State.FAILED)))));
                StringBuilder sb = new StringBuilder(valueOf.length() + 83);
                sb.append("Timeout waiting for the services to stop. The following services have not stopped: ");
                sb.append(valueOf);
                throw new TimeoutException(sb.toString());
            } finally {
                this.monitor.leave();
            }
        }

        public void awaitHealthy(long j, TimeUnit timeUnit) throws TimeoutException {
            this.monitor.enter();
            try {
                if (this.monitor.waitForUninterruptibly(this.awaitHealthGuard, j, timeUnit)) {
                    checkHealthy();
                    return;
                }
                String valueOf = String.valueOf(C43360jX2.m30370c(this.servicesByState, JZ3.m100197f(AbstractC38616bZ1.m64366D(Service.State.NEW, Service.State.STARTING))));
                StringBuilder sb = new StringBuilder(valueOf.length() + 93);
                sb.append("Timeout waiting for the services to become healthy. The following services have not started: ");
                sb.append(valueOf);
                throw new TimeoutException(sb.toString());
            } finally {
                this.monitor.leave();
            }
        }
    }

    public void awaitHealthy(long j, TimeUnit timeUnit) throws TimeoutException {
        this.state.awaitHealthy(j, timeUnit);
    }

    public void awaitStopped(long j, TimeUnit timeUnit) throws TimeoutException {
        this.state.awaitStopped(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.ServiceManagerBridge
    public C39820dZ1<Service.State, Service> servicesByState() {
        return this.state.servicesByState();
    }
}
