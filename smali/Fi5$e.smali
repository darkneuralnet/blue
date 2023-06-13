.class public final LFi5$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFi5;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lm51;",
        "Ll51;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,142:1\n1#2:143\n62#3,5:144\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1\n*L\n92#1:144,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LFi5;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:LFi5$d;


# direct methods
.method public constructor <init>(LFi5;Ljava/lang/Object;LFi5$d;)V
    .locals 0

    iput-object p1, p0, LFi5$e;->g:LFi5;

    iput-object p2, p0, LFi5$e;->h:Ljava/lang/Object;

    iput-object p3, p0, LFi5$e;->i:LFi5$d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, LFi5$e;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 3

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LFi5$e;->g:LFi5;

    invoke-static {p1}, LFi5;->a(LFi5;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, LFi5$e;->h:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iget-object v0, p0, LFi5$e;->h:Ljava/lang/Object;

    if-eqz p1, :cond_0

    iget-object p1, p0, LFi5$e;->g:LFi5;

    invoke-static {p1}, LFi5;->b(LFi5;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, LFi5$e;->h:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LFi5$e;->g:LFi5;

    invoke-static {p1}, LFi5;->a(LFi5;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, LFi5$e;->h:Ljava/lang/Object;

    iget-object v1, p0, LFi5$e;->i:LFi5$d;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LFi5$e;->i:LFi5$d;

    iget-object v0, p0, LFi5$e;->g:LFi5;

    iget-object v1, p0, LFi5$e;->h:Ljava/lang/Object;

    new-instance v2, LFi5$e$a;

    invoke-direct {v2, p1, v0, v1}, LFi5$e$a;-><init>(LFi5$d;LFi5;Ljava/lang/Object;)V

    return-object v2

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Key "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " was used multiple times "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
