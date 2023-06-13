.class Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource$1;
.super LlI6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;->insert(Lzendesk/support/requestlist/RequestInfo;LlI6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LlI6<",
        "Ljava/util/List<",
        "Lzendesk/support/requestlist/RequestInfo;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;

.field final synthetic val$callback:LlI6;

.field final synthetic val$requestInfo:Lzendesk/support/requestlist/RequestInfo;


# direct methods
.method public constructor <init>(Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;Lzendesk/support/requestlist/RequestInfo;LlI6;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource$1;->this$0:Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;

    iput-object p2, p0, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource$1;->val$requestInfo:Lzendesk/support/requestlist/RequestInfo;

    iput-object p3, p0, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource$1;->val$callback:LlI6;

    invoke-direct {p0}, LlI6;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lsg1;)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource$1;->val$callback:LlI6;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LlI6;->onError(Lsg1;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource$1;->onSuccess(Ljava/util/List;)V

    return-void
.end method

.method public onSuccess(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/support/requestlist/RequestInfo;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource$1;->val$requestInfo:Lzendesk/support/requestlist/RequestInfo;

    new-instance v1, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource$1$1;

    invoke-direct {v1, p0}, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource$1$1;-><init>(Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource$1;)V

    invoke-static {p1, v0, v1}, Ljm0;->a(Ljava/util/Collection;Ljava/lang/Object;LiI6;)Ljava/util/List;

    move-result-object p1

    invoke-static {}, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;->access$800()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    iget-object v0, p0, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource$1;->this$0:Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;

    invoke-static {v0}, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;->access$900(Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource;)Lzendesk/support/requestlist/RequestInfoDataSource$Disk;

    move-result-object v0

    iget-object v1, p0, Lzendesk/support/requestlist/RequestInfoDataSource$LocalDataSource$1;->val$callback:LlI6;

    invoke-virtual {v0, p1, v1}, Lzendesk/support/requestlist/RequestInfoDataSource$Disk;->save(Ljava/util/List;LlI6;)V

    return-void
.end method
