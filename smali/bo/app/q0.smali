.class public final Lbo/app/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbo/app/m2;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001b\u0008\u0007\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u000e"
    }
    d2 = {
        "Lbo/app/q0;",
        "Lbo/app/m2;",
        "Lbo/app/l2;",
        "request",
        "",
        "c",
        "b",
        "a",
        "Lbo/app/g2;",
        "internalEventPublisher",
        "",
        "shouldStoreMockedHistory",
        "<init>",
        "(Lbo/app/g2;Z)V",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field private final a:Lbo/app/g2;

.field private b:Z

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lbo/app/z1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbo/app/g2;Z)V
    .locals 1

    const-string v0, "internalEventPublisher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbo/app/q0;->a:Lbo/app/g2;

    iput-boolean p2, p0, Lbo/app/q0;->b:Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lbo/app/q0;->c:Ljava/util/List;

    return-void
.end method

.method private final c(Lbo/app/l2;)V
    .locals 8

    sget-object v0, Lk20;->a:Lk20;

    sget-object v5, Lbo/app/q0$a;->b:Lbo/app/q0$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object v0, p0, Lbo/app/q0;->a:Lbo/app/g2;

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lbo/app/l2;->a(Lbo/app/g2;Lbo/app/d;)V

    iget-object v0, p0, Lbo/app/q0;->a:Lbo/app/g2;

    invoke-interface {p1, v0}, Lbo/app/l2;->b(Lbo/app/g2;)V

    instance-of v0, p1, Lbo/app/z1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbo/app/q0;->a:Lbo/app/g2;

    new-instance v1, Lbo/app/p0;

    check-cast p1, Lbo/app/z1;

    invoke-direct {v1, p1}, Lbo/app/p0;-><init>(Lbo/app/z1;)V

    const-class p1, Lbo/app/p0;

    invoke-interface {v0, v1, p1}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lbo/app/l2;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lbo/app/q0;->c(Lbo/app/l2;)V

    return-void
.end method

.method public b(Lbo/app/l2;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lbo/app/q0;->c(Lbo/app/l2;)V

    return-void
.end method
