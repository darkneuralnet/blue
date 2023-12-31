.class Lzendesk/support/request/StateAttachments;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/request/StateAttachments$UriComparator;,
        Lzendesk/support/request/StateAttachments$Builder;
    }
.end annotation


# instance fields
.field private final allSelectedAttachments:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedAttachments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzendesk/support/request/StateAttachments;->selectedAttachments:Ljava/util/List;

    new-instance v0, Ljava/util/TreeSet;

    new-instance v1, Lzendesk/support/request/StateAttachments$UriComparator;

    invoke-direct {v1}, Lzendesk/support/request/StateAttachments$UriComparator;-><init>()V

    invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    iput-object v0, p0, Lzendesk/support/request/StateAttachments;->allSelectedAttachments:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;",
            "Ljava/util/Set<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/request/StateAttachments;->selectedAttachments:Ljava/util/List;

    iput-object p2, p0, Lzendesk/support/request/StateAttachments;->allSelectedAttachments:Ljava/util/Set;

    return-void
.end method

.method public static fromState(Lzendesk/support/suas/State;)Lzendesk/support/request/StateAttachments;
    .locals 1

    const-class v0, Lzendesk/support/request/StateAttachments;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lzendesk/support/suas/State;->getState(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lzendesk/support/request/StateAttachments;

    if-eqz v0, :cond_0

    check-cast p0, Lzendesk/support/request/StateAttachments;

    return-object p0

    :cond_0
    new-instance p0, Lzendesk/support/request/StateAttachments;

    invoke-direct {p0}, Lzendesk/support/request/StateAttachments;-><init>()V

    return-object p0
.end method


# virtual methods
.method public getAllSelectedAttachments()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/request/StateAttachments;->allSelectedAttachments:Ljava/util/Set;

    return-object v0
.end method

.method public getSelectedAttachments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lzendesk/support/request/StateRequestAttachment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/request/StateAttachments;->selectedAttachments:Ljava/util/List;

    return-object v0
.end method

.method public newBuilder()Lzendesk/support/request/StateAttachments$Builder;
    .locals 2

    new-instance v0, Lzendesk/support/request/StateAttachments$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lzendesk/support/request/StateAttachments$Builder;-><init>(Lzendesk/support/request/StateAttachments;Lzendesk/support/request/StateAttachments$1;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Attachments{selectedAttachments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzendesk/support/request/StateAttachments;->selectedAttachments:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allSelectedAttachments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzendesk/support/request/StateAttachments;->allSelectedAttachments:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
