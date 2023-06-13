.class public final LFU2$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFU2;->o(LHU2;Llf;Lkotlin/jvm/functions/Function1;ZLEt0;II)LGU2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LGU2;",
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


# instance fields
.field public final synthetic g:LHU2;

.field public final synthetic h:Llf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llf<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LHU2;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:Z


# direct methods
.method public constructor <init>(LHU2;Llf;Lkotlin/jvm/functions/Function1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHU2;",
            "Llf<",
            "Ljava/lang/Float;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LHU2;",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, LFU2$m;->g:LHU2;

    iput-object p2, p0, LFU2$m;->h:Llf;

    iput-object p3, p0, LFU2$m;->i:Lkotlin/jvm/functions/Function1;

    iput-boolean p4, p0, LFU2$m;->j:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LGU2;
    .locals 4

    iget-object v0, p0, LFU2$m;->g:LHU2;

    iget-object v1, p0, LFU2$m;->h:Llf;

    iget-object v2, p0, LFU2$m;->i:Lkotlin/jvm/functions/Function1;

    iget-boolean v3, p0, LFU2$m;->j:Z

    invoke-static {v0, v1, v2, v3}, LFU2;->d(LHU2;Llf;Lkotlin/jvm/functions/Function1;Z)LGU2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LFU2$m;->b()LGU2;

    move-result-object v0

    return-object v0
.end method
