.class Lzendesk/support/Streams$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/support/Streams$Use;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/support/Streams;->toJson(LoE1;LwB5;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lzendesk/support/Streams$Use<",
        "Ljava/lang/Void;",
        "Ljava/io/Writer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$data:Ljava/lang/Object;

.field final synthetic val$gson:LoE1;


# direct methods
.method public constructor <init>(LoE1;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/Streams$2;->val$gson:LoE1;

    iput-object p2, p0, Lzendesk/support/Streams$2;->val$data:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic use(Ljava/io/Closeable;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Ljava/io/Writer;

    invoke-virtual {p0, p1}, Lzendesk/support/Streams$2;->use(Ljava/io/Writer;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public use(Ljava/io/Writer;)Ljava/lang/Void;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/Streams$2;->val$gson:LoE1;

    iget-object v1, p0, Lzendesk/support/Streams$2;->val$data:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, LoE1;->B(Ljava/lang/Object;Ljava/lang/Appendable;)V

    const/4 p1, 0x0

    return-object p1
.end method
