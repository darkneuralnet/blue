.class public final LMe$d$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMe$d$c;->invoke(LTe;LEt0;I)V
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
        "SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$7$1$4$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,780:1\n62#2,5:781\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$7$1$4$1\n*L\n694#1:781,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LMM5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LMM5<",
            "TS;>;"
        }
    .end annotation
.end field

.field public final synthetic h:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TS;"
        }
    .end annotation
.end field

.field public final synthetic i:LOe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LOe<",
            "TS;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LMM5;Ljava/lang/Object;LOe;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMM5<",
            "TS;>;TS;",
            "LOe<",
            "TS;>;)V"
        }
    .end annotation

    iput-object p1, p0, LMe$d$c$a;->g:LMM5;

    iput-object p2, p0, LMe$d$c$a;->h:Ljava/lang/Object;

    iput-object p3, p0, LMe$d$c$a;->i:LOe;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, LMe$d$c$a;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 3

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LMe$d$c$a;->g:LMM5;

    iget-object v0, p0, LMe$d$c$a;->h:Ljava/lang/Object;

    iget-object v1, p0, LMe$d$c$a;->i:LOe;

    new-instance v2, LMe$d$c$a$a;

    invoke-direct {v2, p1, v0, v1}, LMe$d$c$a$a;-><init>(LMM5;Ljava/lang/Object;LOe;)V

    return-object v2
.end method
