.class public final Lrm2;
.super LgV2$c;
.source "SourceFile"

# interfaces
.implements LTE3;
.implements Lsm2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000c\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R*\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00058\u0016@PX\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Lrm2;",
        "LTE3;",
        "Lsm2;",
        "LgV2$c;",
        "Lg01;",
        "",
        "parentData",
        "B",
        "<set-?>",
        "l",
        "Ljava/lang/Object;",
        "getLayoutId",
        "()Ljava/lang/Object;",
        "e0",
        "(Ljava/lang/Object;)V",
        "layoutId",
        "<init>",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "layoutId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LgV2$c;-><init>()V

    iput-object p1, p0, Lrm2;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public B(Lg01;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const-string p2, "<this>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public e0(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lrm2;->l:Ljava/lang/Object;

    return-void
.end method

.method public getLayoutId()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrm2;->l:Ljava/lang/Object;

    return-object v0
.end method
