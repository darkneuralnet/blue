.class Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1$1;
.super LlI6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1;->onSuccess(Ljava/util/List;)V
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
.field final synthetic this$1:Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1;

.field final synthetic val$localInfos:Ljava/util/List;


# direct methods
.method public constructor <init>(Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1$1;->this$1:Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1;

    iput-object p2, p0, Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1$1;->val$localInfos:Ljava/util/List;

    invoke-direct {p0}, LlI6;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lsg1;)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1$1;->this$1:Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1;

    iget-object v0, v0, Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1;->val$callback:LlI6;

    invoke-virtual {v0, p1}, LlI6;->onError(Lsg1;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1$1;->onSuccess(Ljava/util/List;)V

    return-void
.end method

.method public onSuccess(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/support/requestlist/RequestInfo;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1$1;->this$1:Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1;

    iget-object v1, v0, Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1;->val$callback:LlI6;

    iget-object v0, v0, Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1;->this$0:Lzendesk/support/requestlist/RequestInfoDataSource$Repository;

    invoke-static {v0}, Lzendesk/support/requestlist/RequestInfoDataSource$Repository;->access$000(Lzendesk/support/requestlist/RequestInfoDataSource$Repository;)Lzendesk/support/requestlist/RequestInfoMerger;

    move-result-object v0

    iget-object v2, p0, Lzendesk/support/requestlist/RequestInfoDataSource$Repository$1$1;->val$localInfos:Ljava/util/List;

    invoke-virtual {v0, v2, p1}, Lzendesk/support/requestlist/RequestInfoMerger;->merge(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, LlI6;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
