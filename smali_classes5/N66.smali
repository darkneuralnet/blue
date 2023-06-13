.class public final LN66;
.super Landroidx/recyclerview/widget/h$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/h$f<",
        "Lcom/chuckerteam/chucker/internal/data/entity/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a8\u0006\u000c"
    }
    d2 = {
        "LN66;",
        "Landroidx/recyclerview/widget/h$f;",
        "Lcom/chuckerteam/chucker/internal/data/entity/a;",
        "oldItem",
        "newItem",
        "",
        "b",
        "a",
        "",
        "c",
        "<init>",
        "()V",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LN66;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LN66;

    invoke-direct {v0}, LN66;-><init>()V

    sput-object v0, LN66;->a:LN66;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/recyclerview/widget/h$f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/chuckerteam/chucker/internal/data/entity/a;Lcom/chuckerteam/chucker/internal/data/entity/a;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/chuckerteam/chucker/internal/data/entity/a;

    check-cast p2, Lcom/chuckerteam/chucker/internal/data/entity/a;

    invoke-virtual {p0, p1, p2}, LN66;->a(Lcom/chuckerteam/chucker/internal/data/entity/a;Lcom/chuckerteam/chucker/internal/data/entity/a;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/chuckerteam/chucker/internal/data/entity/a;

    check-cast p2, Lcom/chuckerteam/chucker/internal/data/entity/a;

    invoke-virtual {p0, p1, p2}, LN66;->b(Lcom/chuckerteam/chucker/internal/data/entity/a;Lcom/chuckerteam/chucker/internal/data/entity/a;)Z

    move-result p1

    return p1
.end method

.method public b(Lcom/chuckerteam/chucker/internal/data/entity/a;Lcom/chuckerteam/chucker/internal/data/entity/a;)Z
    .locals 2

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/a;->g()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/chuckerteam/chucker/internal/data/entity/a;->g()J

    move-result-wide p1

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public c(Lcom/chuckerteam/chucker/internal/data/entity/a;Lcom/chuckerteam/chucker/internal/data/entity/a;)V
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "newItem"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/chuckerteam/chucker/internal/data/entity/a;

    check-cast p2, Lcom/chuckerteam/chucker/internal/data/entity/a;

    invoke-virtual {p0, p1, p2}, LN66;->c(Lcom/chuckerteam/chucker/internal/data/entity/a;Lcom/chuckerteam/chucker/internal/data/entity/a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
