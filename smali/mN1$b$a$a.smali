.class public final LmN1$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll51;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmN1$b$a;->invoke(Lm51;)Ll51;
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
        "mN1$b$a$a",
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
        "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$1$1\n*L\n1#1,484:1\n84#2:485\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:LEX2;

.field public final synthetic b:LrX2;


# direct methods
.method public constructor <init>(LEX2;LrX2;)V
    .locals 0

    iput-object p1, p0, LmN1$b$a$a;->a:LEX2;

    iput-object p2, p0, LmN1$b$a$a;->b:LrX2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, LmN1$b$a$a;->a:LEX2;

    iget-object v1, p0, LmN1$b$a$a;->b:LrX2;

    invoke-static {v0, v1}, LmN1$b;->c(LEX2;LrX2;)V

    return-void
.end method
