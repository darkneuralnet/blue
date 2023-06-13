.class public final Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0080\u0008\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J-\u0010\u0010\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0006H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;",
        "",
        "title",
        "Lcom/stripe/android/financialconnections/ui/TextResource;",
        "content",
        "icon",
        "",
        "(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Ljava/lang/String;)V",
        "getContent",
        "()Lcom/stripe/android/financialconnections/ui/TextResource;",
        "getIcon",
        "()Ljava/lang/String;",
        "getTitle",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "Companion",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;


# instance fields
.field private final content:Lcom/stripe/android/financialconnections/ui/TextResource;

.field private final icon:Ljava/lang/String;

.field private final title:Lcom/stripe/android/financialconnections/ui/TextResource;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->Companion:Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->icon:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->icon:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->copy(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Ljava/lang/String;)Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/ui/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/ui/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Ljava/lang/String;)Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;-><init>(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->icon:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->icon:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getContent()Lcom/stripe/android/financialconnections/ui/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    return-object v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Lcom/stripe/android/financialconnections/ui/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->icon:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->title:Lcom/stripe/android/financialconnections/ui/TextResource;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->content:Lcom/stripe/android/financialconnections/ui/TextResource;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->icon:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "BulletUI(title="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", content="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
