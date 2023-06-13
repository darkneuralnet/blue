.class public final LsV2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LlD3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LsV2$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000e"
    }
    d2 = {
        "LsV2;",
        "LlD3;",
        "Lhe3;",
        "b",
        "Lhe3;",
        "()Lhe3;",
        "observerNode",
        "",
        "L",
        "()Z",
        "isValidOwnerScope",
        "<init>",
        "(Lhe3;)V",
        "c",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final c:LsV2$b;

.field public static final d:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LsV2;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Lhe3;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LsV2$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LsV2$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LsV2;->c:LsV2$b;

    sget-object v0, LsV2$a;->g:LsV2$a;

    sput-object v0, LsV2;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public constructor <init>(Lhe3;)V
    .locals 1

    const-string v0, "observerNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LsV2;->b:Lhe3;

    return-void
.end method

.method public static final synthetic a()Lkotlin/jvm/functions/Function1;
    .locals 1

    sget-object v0, LsV2;->d:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method


# virtual methods
.method public L()Z
    .locals 1

    iget-object v0, p0, LsV2;->b:Lhe3;

    invoke-interface {v0}, LvZ0;->r()LgV2$c;

    move-result-object v0

    invoke-virtual {v0}, LgV2$c;->Q()Z

    move-result v0

    return v0
.end method

.method public final b()Lhe3;
    .locals 1

    iget-object v0, p0, LsV2;->b:Lhe3;

    return-object v0
.end method
