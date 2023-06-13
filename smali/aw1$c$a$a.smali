.class public final Law1$c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll51;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Law1$c$a;->invoke(Lm51;)Ll51;
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
        "aw1$c$a$a",
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
        "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$1$1\n*L\n1#1,484:1\n87#2,6:485\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:LEX2;

.field public final synthetic b:LrX2;


# direct methods
.method public constructor <init>(LEX2;LrX2;)V
    .locals 0

    iput-object p1, p0, Law1$c$a$a;->a:LEX2;

    iput-object p2, p0, Law1$c$a$a;->b:LrX2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Law1$c$a$a;->a:LEX2;

    invoke-interface {v0}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxv1;

    if-eqz v0, :cond_1

    new-instance v1, Lyv1;

    invoke-direct {v1, v0}, Lyv1;-><init>(Lxv1;)V

    iget-object v0, p0, Law1$c$a$a;->b:LrX2;

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, LrX2;->a(Ld62;)Z

    :cond_0
    iget-object v0, p0, Law1$c$a$a;->a:LEX2;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LEX2;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
