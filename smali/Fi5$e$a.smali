.class public final LFi5$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll51;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFi5$e;->invoke(Lm51;)Ll51;
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
        "Fi5$e$a",
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
        "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1\n*L\n1#1,484:1\n93#2,3:485\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:LFi5$d;

.field public final synthetic b:LFi5;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LFi5$d;LFi5;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LFi5$e$a;->a:LFi5$d;

    iput-object p2, p0, LFi5$e$a;->b:LFi5;

    iput-object p3, p0, LFi5$e$a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, LFi5$e$a;->a:LFi5$d;

    iget-object v1, p0, LFi5$e$a;->b:LFi5;

    invoke-static {v1}, LFi5;->b(LFi5;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, LFi5$d;->b(Ljava/util/Map;)V

    iget-object v0, p0, LFi5$e$a;->b:LFi5;

    invoke-static {v0}, LFi5;->a(LFi5;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LFi5$e$a;->c:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
