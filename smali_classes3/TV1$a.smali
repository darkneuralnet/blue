.class public final LTV1$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTV1;-><init>(Lco/bird/android/core/mvp/BaseActivity;LS3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lgj1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lgj1;",
        "b",
        "()Lgj1;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LTV1$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LTV1$a;

    invoke-direct {v0}, LTV1$a;-><init>()V

    sput-object v0, LTV1$a;->g:LTV1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lgj1;
    .locals 2

    new-instance v0, Lhj1$a;

    invoke-direct {v0}, Lhj1$a;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lhj1$a;->e(I)Lhj1$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lhj1$a;->b(I)Lhj1$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lhj1$a;->d(I)Lhj1$a;

    move-result-object v0

    invoke-virtual {v0}, Lhj1$a;->a()Lhj1;

    move-result-object v0

    invoke-static {v0}, Lfj1;->a(Lhj1;)Lgj1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LTV1$a;->b()Lgj1;

    move-result-object v0

    return-object v0
.end method
