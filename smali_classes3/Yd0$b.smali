.class public final LYd0$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYd0;->Pl()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LGJ6;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LGJ6;",
        "",
        "a",
        "(LGJ6;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LYd0;

.field public final synthetic h:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYd0;Landroid/widget/ArrayAdapter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYd0;",
            "Landroid/widget/ArrayAdapter<",
            "Ljava/lang/CharSequence;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYd0$b;->g:LYd0;

    iput-object p2, p0, LYd0$b;->h:Landroid/widget/ArrayAdapter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LGJ6;)V
    .locals 3

    const-string v0, "$this$onItemSelectedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYd0$b$a;

    iget-object v1, p0, LYd0$b;->g:LYd0;

    iget-object v2, p0, LYd0$b;->h:Landroid/widget/ArrayAdapter;

    invoke-direct {v0, v1, v2}, LYd0$b$a;-><init>(LYd0;Landroid/widget/ArrayAdapter;)V

    invoke-virtual {p1, v0}, LGJ6;->a(Lkotlin/jvm/functions/Function4;)V

    new-instance v0, LYd0$b$b;

    iget-object v1, p0, LYd0$b;->g:LYd0;

    invoke-direct {v0, v1}, LYd0$b$b;-><init>(LYd0;)V

    invoke-virtual {p1, v0}, LGJ6;->b(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LGJ6;

    invoke-virtual {p0, p1}, LYd0$b;->a(LGJ6;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
