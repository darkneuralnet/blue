.class public final Lak0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll51;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lak0$a;->invoke(Lm51;)Ll51;
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
        "ak0$a$a",
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
        "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt$PressedInteractionSourceDisposableEffect$1\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,484:1\n417#2,6:485\n423#2,2:492\n425#2,2:495\n1855#3:491\n1856#3:494\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$PressedInteractionSourceDisposableEffect$1\n*L\n422#1:491\n422#1:494\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:LEX2;

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:LrX2;


# direct methods
.method public constructor <init>(LEX2;Ljava/util/Map;LrX2;)V
    .locals 0

    iput-object p1, p0, Lak0$a$a;->a:LEX2;

    iput-object p2, p0, Lak0$a$a;->b:Ljava/util/Map;

    iput-object p3, p0, Lak0$a$a;->c:LrX2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 4

    iget-object v0, p0, Lak0$a$a;->a:LEX2;

    invoke-interface {v0}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQ14;

    if-eqz v0, :cond_0

    new-instance v1, LP14;

    invoke-direct {v1, v0}, LP14;-><init>(LQ14;)V

    iget-object v0, p0, Lak0$a$a;->c:LrX2;

    invoke-interface {v0, v1}, LrX2;->a(Ld62;)Z

    iget-object v0, p0, Lak0$a$a;->a:LEX2;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LEX2;->setValue(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lak0$a$a;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQ14;

    iget-object v2, p0, Lak0$a$a;->c:LrX2;

    new-instance v3, LP14;

    invoke-direct {v3, v1}, LP14;-><init>(LQ14;)V

    invoke-interface {v2, v3}, LrX2;->a(Ld62;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lak0$a$a;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method
