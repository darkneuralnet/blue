.class public final LJ96$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll51;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ96$b;->invoke(Lm51;)Ll51;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "J96$b$a",
        "Ll51;",
        "",
        "dispose",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1\n*L\n1#1,483:1\n756#2,2:484\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:LF96;

.field public final synthetic b:LF96$a;


# direct methods
.method public constructor <init>(LF96;LF96$a;)V
    .locals 0

    iput-object p1, p0, LJ96$b$a;->a:LF96;

    iput-object p2, p0, LJ96$b$a;->b:LF96$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, LJ96$b$a;->a:LF96;

    iget-object v1, p0, LJ96$b$a;->b:LF96$a;

    invoke-virtual {v0, v1}, LF96;->v(LF96$a;)V

    return-void
.end method
