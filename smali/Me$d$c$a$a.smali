.class public final LMe$d$c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll51;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMe$d$c$a;->invoke(Lm51;)Ll51;
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
        "Me$d$c$a$a",
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
        "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$7$1$4$1\n*L\n1#1,483:1\n695#2,3:484\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:LMM5;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:LOe;


# direct methods
.method public constructor <init>(LMM5;Ljava/lang/Object;LOe;)V
    .locals 0

    iput-object p1, p0, LMe$d$c$a$a;->a:LMM5;

    iput-object p2, p0, LMe$d$c$a$a;->b:Ljava/lang/Object;

    iput-object p3, p0, LMe$d$c$a$a;->c:LOe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, LMe$d$c$a$a;->a:LMM5;

    iget-object v1, p0, LMe$d$c$a$a;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, LMM5;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, LMe$d$c$a$a;->c:LOe;

    invoke-virtual {v0}, LOe;->g()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LMe$d$c$a$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
