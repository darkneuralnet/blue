.class public final LD5$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD5;->a(Lv5;Lkotlin/jvm/functions/Function1;LEt0;I)LTH2;
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
        "SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,161:1\n62#2,5:162\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n*L\n108#1:162,5\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LC5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LC5<",
            "TI;>;"
        }
    .end annotation
.end field

.field public final synthetic h:Landroidx/activity/result/ActivityResultRegistry;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lv5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv5<",
            "TI;TO;>;"
        }
    .end annotation
.end field

.field public final synthetic k:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lkotlin/jvm/functions/Function1<",
            "TO;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LC5;Landroidx/activity/result/ActivityResultRegistry;Ljava/lang/String;Lv5;LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LC5<",
            "TI;>;",
            "Landroidx/activity/result/ActivityResultRegistry;",
            "Ljava/lang/String;",
            "Lv5<",
            "TI;TO;>;",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-TO;",
            "Lkotlin/Unit;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, LD5$a;->g:LC5;

    iput-object p2, p0, LD5$a;->h:Landroidx/activity/result/ActivityResultRegistry;

    iput-object p3, p0, LD5$a;->i:Ljava/lang/String;

    iput-object p4, p0, LD5$a;->j:Lv5;

    iput-object p5, p0, LD5$a;->k:LsP5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, LD5$a;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 5

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LD5$a;->g:LC5;

    iget-object v0, p0, LD5$a;->h:Landroidx/activity/result/ActivityResultRegistry;

    iget-object v1, p0, LD5$a;->i:Ljava/lang/String;

    iget-object v2, p0, LD5$a;->j:Lv5;

    new-instance v3, LD5$a$a;

    iget-object v4, p0, LD5$a;->k:LsP5;

    invoke-direct {v3, v4}, LD5$a$a;-><init>(LsP5;)V

    invoke-virtual {v0, v1, v2, v3}, Landroidx/activity/result/ActivityResultRegistry;->i(Ljava/lang/String;Lv5;Lt5;)LB5;

    move-result-object v0

    invoke-virtual {p1, v0}, LC5;->b(LB5;)V

    iget-object p1, p0, LD5$a;->g:LC5;

    new-instance v0, LD5$a$b;

    invoke-direct {v0, p1}, LD5$a$b;-><init>(LC5;)V

    return-object v0
.end method
