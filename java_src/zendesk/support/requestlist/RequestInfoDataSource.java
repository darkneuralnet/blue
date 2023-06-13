package zendesk.support.requestlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import zendesk.support.Attachment;
import zendesk.support.Comment;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.RequestUpdates;
import zendesk.support.SupportUiStorage;
import zendesk.support.User;
import zendesk.support.requestlist.RequestInfo;
/* loaded from: classes8.dex */
public interface RequestInfoDataSource {
    public static final String LOCAL = "local_request_infos";
    public static final String REMOTE = "remote_request_infos";

    /* loaded from: classes8.dex */
    public static class Disk implements RequestInfoDataSource {
        private final Executor backgroundThreadExecutor;
        private final String cacheKey;
        private final Executor mainThreadExecutor;
        private final SupportUiStorage supportUiStorage;

        public Disk(Executor executor, Executor executor2, SupportUiStorage supportUiStorage, String str) {
            this.mainThreadExecutor = executor;
            this.backgroundThreadExecutor = executor2;
            this.supportUiStorage = supportUiStorage;
            this.cacheKey = str;
        }

        @Override // zendesk.support.requestlist.RequestInfoDataSource
        public void load(final AbstractC44415lI6<List<RequestInfo>> abstractC44415lI6) {
            this.backgroundThreadExecutor.execute(new Runnable() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Disk.1
                @Override // java.lang.Runnable
                public void run() {
                    final List list = (List) Disk.this.supportUiStorage.read(Disk.this.cacheKey, new C32798Fb6<List<RequestInfo>>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Disk.1.1
                    }.getType());
                    Disk.this.mainThreadExecutor.execute(new Runnable() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Disk.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            abstractC44415lI6.onSuccess(C43505jm0.m29952e(list));
                        }
                    });
                }
            });
        }

        public void save(final List<RequestInfo> list, final AbstractC44415lI6<List<RequestInfo>> abstractC44415lI6) {
            this.backgroundThreadExecutor.execute(new Runnable() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Disk.2
                @Override // java.lang.Runnable
                public void run() {
                    Disk.this.supportUiStorage.write(Disk.this.cacheKey, list);
                    if (abstractC44415lI6 != null) {
                        Disk.this.mainThreadExecutor.execute(new Runnable() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Disk.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                RunnableC314292 runnableC314292 = RunnableC314292.this;
                                abstractC44415lI6.onSuccess(list);
                            }
                        });
                    }
                }
            });
        }
    }

    /* loaded from: classes8.dex */
    public static class LocalDataSource implements RequestInfoDataSource {
        private static final Comparator<RequestInfo> REQUEST_INFO_COMPARATOR = new RequestInfo.LastUpdatedComparator();
        private final Disk disk;

        public LocalDataSource(Disk disk) {
            this.disk = disk;
        }

        public void insert(final RequestInfo requestInfo, final AbstractC44415lI6<List<RequestInfo>> abstractC44415lI6) {
            this.disk.load(new AbstractC44415lI6<List<RequestInfo>>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource.1
                @Override // p000.AbstractC44415lI6
                public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                    AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                    if (abstractC44415lI62 != null) {
                        abstractC44415lI62.onError(interfaceC48782sg1);
                    }
                }

                @Override // p000.AbstractC44415lI6
                public void onSuccess(List<RequestInfo> list) {
                    List<RequestInfo> m29956a = C43505jm0.m29956a(list, requestInfo, new InterfaceC42636iI6<RequestInfo, RequestInfo, Boolean>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource.1.1
                        @Override // p000.InterfaceC42636iI6
                        public Boolean apply(RequestInfo requestInfo2, RequestInfo requestInfo3) {
                            boolean equals = requestInfo3.getLocalId().equals(requestInfo2.getLocalId());
                            boolean z = true;
                            boolean z2 = C44504lS5.m27273b(requestInfo3.getRemoteId()) && requestInfo3.getRemoteId().equals(requestInfo2.getRemoteId());
                            if (!equals && !z2) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    });
                    Collections.sort(m29956a, LocalDataSource.REQUEST_INFO_COMPARATOR);
                    LocalDataSource.this.disk.save(m29956a, abstractC44415lI6);
                }
            });
        }

        @Override // zendesk.support.requestlist.RequestInfoDataSource
        public void load(AbstractC44415lI6<List<RequestInfo>> abstractC44415lI6) {
            this.disk.load(abstractC44415lI6);
        }

        public void remove(final String str, final AbstractC44415lI6<List<RequestInfo>> abstractC44415lI6) {
            this.disk.load(new AbstractC44415lI6<List<RequestInfo>>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource.2
                @Override // p000.AbstractC44415lI6
                public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                    AbstractC44415lI6 abstractC44415lI62 = abstractC44415lI6;
                    if (abstractC44415lI62 != null) {
                        abstractC44415lI62.onError(interfaceC48782sg1);
                    }
                }

                @Override // p000.AbstractC44415lI6
                public void onSuccess(List<RequestInfo> list) {
                    LocalDataSource.this.disk.save(C43505jm0.m29951f(list, new InterfaceC42043hI6<RequestInfo, Boolean>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource.2.1
                        @Override // p000.InterfaceC42043hI6
                        public Boolean apply(RequestInfo requestInfo) {
                            return Boolean.valueOf(!str.equals(requestInfo.getLocalId()));
                        }
                    }), abstractC44415lI6);
                }
            });
        }
    }

    /* loaded from: classes8.dex */
    public static class Network implements RequestInfoDataSource {
        private final RequestProvider requestProvider;

        /* renamed from: zendesk.support.requestlist.RequestInfoDataSource$Network$1 */
        /* loaded from: classes8.dex */
        public class C314351 extends AbstractC44415lI6<List<Request>> {
            final /* synthetic */ AbstractC44415lI6 val$callback;

            public C314351(AbstractC44415lI6 abstractC44415lI6) {
                this.val$callback = abstractC44415lI6;
            }

            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                this.val$callback.onError(interfaceC48782sg1);
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(final List<Request> list) {
                Network.this.requestProvider.getUpdatesForDevice(new AbstractC44415lI6<RequestUpdates>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Network.1.1
                    @Override // p000.AbstractC44415lI6
                    public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                        C314351.this.val$callback.onError(interfaceC48782sg1);
                    }

                    @Override // p000.AbstractC44415lI6
                    public void onSuccess(final RequestUpdates requestUpdates) {
                        C314351.this.val$callback.onSuccess(C43505jm0.m29946k(list, new InterfaceC42043hI6<Request, RequestInfo>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Network.1.1.1
                            @Override // p000.InterfaceC42043hI6
                            public RequestInfo apply(Request request) {
                                return Network.this.map(request, requestUpdates.isRequestUnread(request.getId()));
                            }
                        }));
                    }
                });
            }
        }

        public Network(RequestProvider requestProvider) {
            this.requestProvider = requestProvider;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public RequestInfo map(Request request, boolean z) {
            Comment firstComment = request.getFirstComment();
            Comment lastComment = request.getLastComment();
            return new RequestInfo("", request.getId(), request.getStatus(), z, request.getPublicUpdatedAt(), C43505jm0.m29946k(C43505jm0.m29951f(request.getLastCommentingAgents(), new InterfaceC42043hI6<User, Boolean>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Network.2
                @Override // p000.InterfaceC42043hI6
                public Boolean apply(User user) {
                    return Boolean.valueOf(user != null);
                }
            }), new InterfaceC42043hI6<User, RequestInfo.AgentInfo>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Network.3
                @Override // p000.InterfaceC42043hI6
                public RequestInfo.AgentInfo apply(User user) {
                    Attachment photo = user.getPhoto();
                    return new RequestInfo.AgentInfo(String.valueOf(user.getId()), user.getName(), photo != null ? photo.getContentUrl() : "");
                }
            }), new RequestInfo.MessageInfo(String.valueOf(firstComment.getId()), firstComment.getCreatedAt(), firstComment.getBody()), new RequestInfo.MessageInfo(String.valueOf(lastComment.getId()), lastComment.getCreatedAt(), lastComment.getBody()), new HashSet());
        }

        @Override // zendesk.support.requestlist.RequestInfoDataSource
        public void load(AbstractC44415lI6<List<RequestInfo>> abstractC44415lI6) {
            this.requestProvider.getAllRequests(new C314351(abstractC44415lI6));
        }
    }

    /* loaded from: classes8.dex */
    public static class RemoteDataSource implements RequestInfoDataSource {
        private final Disk disk;
        private final Network network;

        public RemoteDataSource(Network network, Disk disk) {
            this.network = network;
            this.disk = disk;
        }

        @Override // zendesk.support.requestlist.RequestInfoDataSource
        public void load(final AbstractC44415lI6<List<RequestInfo>> abstractC44415lI6) {
            this.network.load(new AbstractC44415lI6<List<RequestInfo>>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.RemoteDataSource.1
                @Override // p000.AbstractC44415lI6
                public void onError(final InterfaceC48782sg1 interfaceC48782sg1) {
                    RemoteDataSource.this.disk.load(new AbstractC44415lI6<List<RequestInfo>>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.RemoteDataSource.1.1
                        @Override // p000.AbstractC44415lI6
                        public void onError(InterfaceC48782sg1 interfaceC48782sg12) {
                            abstractC44415lI6.onError(interfaceC48782sg12);
                        }

                        @Override // p000.AbstractC44415lI6
                        public void onSuccess(List<RequestInfo> list) {
                            abstractC44415lI6.onSuccess(list);
                            abstractC44415lI6.onError(interfaceC48782sg1);
                        }
                    });
                }

                @Override // p000.AbstractC44415lI6
                public void onSuccess(List<RequestInfo> list) {
                    RemoteDataSource.this.disk.save(list, abstractC44415lI6);
                }
            });
        }
    }

    /* loaded from: classes8.dex */
    public static class Repository implements RequestInfoDataSource {
        private final RequestInfoDataSource localDataSource;
        private final RequestInfoMerger merger;
        private final RequestInfoDataSource remoteDataSource;

        public Repository(RequestInfoDataSource requestInfoDataSource, RequestInfoDataSource requestInfoDataSource2, RequestInfoMerger requestInfoMerger) {
            this.localDataSource = requestInfoDataSource;
            this.remoteDataSource = requestInfoDataSource2;
            this.merger = requestInfoMerger;
        }

        @Override // zendesk.support.requestlist.RequestInfoDataSource
        public void load(final AbstractC44415lI6<List<RequestInfo>> abstractC44415lI6) {
            this.localDataSource.load(new AbstractC44415lI6<List<RequestInfo>>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Repository.1
                @Override // p000.AbstractC44415lI6
                public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                }

                @Override // p000.AbstractC44415lI6
                public void onSuccess(final List<RequestInfo> list) {
                    Repository.this.remoteDataSource.load(new AbstractC44415lI6<List<RequestInfo>>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Repository.1.1
                        @Override // p000.AbstractC44415lI6
                        public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                            abstractC44415lI6.onError(interfaceC48782sg1);
                        }

                        @Override // p000.AbstractC44415lI6
                        public void onSuccess(List<RequestInfo> list2) {
                            C314421 c314421 = C314421.this;
                            abstractC44415lI6.onSuccess(Repository.this.merger.merge(list, list2));
                        }
                    });
                }
            });
        }
    }

    void load(AbstractC44415lI6<List<RequestInfo>> abstractC44415lI6);
}
