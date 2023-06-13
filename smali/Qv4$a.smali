.class public final LQv4$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQv4;->b([Ljava/lang/Object;LRi5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;II)Ljava/lang/Object;
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
        "SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt$rememberSaveable$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,200:1\n62#2,5:201\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt$rememberSaveable$1\n*L\n107#1:201,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LHi5;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "LRi5<",
            "TT;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic j:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LHi5;Ljava/lang/String;LsP5;LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHi5;",
            "Ljava/lang/String;",
            "LsP5<",
            "+",
            "LRi5<",
            "TT;",
            "Ljava/lang/Object;",
            ">;>;",
            "LsP5<",
            "+TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LQv4$a;->g:LHi5;

    iput-object p2, p0, LQv4$a;->h:Ljava/lang/String;

    iput-object p3, p0, LQv4$a;->i:LsP5;

    iput-object p4, p0, LQv4$a;->j:LsP5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, LQv4$a;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 3

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, LQv4$a$b;

    iget-object v0, p0, LQv4$a;->i:LsP5;

    iget-object v1, p0, LQv4$a;->j:LsP5;

    iget-object v2, p0, LQv4$a;->g:LHi5;

    invoke-direct {p1, v0, v1, v2}, LQv4$a$b;-><init>(LsP5;LsP5;LHi5;)V

    iget-object v0, p0, LQv4$a;->g:LHi5;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, LQv4;->a(LHi5;Ljava/lang/Object;)V

    iget-object v0, p0, LQv4$a;->g:LHi5;

    iget-object v1, p0, LQv4$a;->h:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, LHi5;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)LHi5$a;

    move-result-object p1

    new-instance v0, LQv4$a$a;

    invoke-direct {v0, p1}, LQv4$a$a;-><init>(LHi5$a;)V

    return-object v0
.end method
