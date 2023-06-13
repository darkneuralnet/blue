.class public final LNn2$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBG$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNn2;->a(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Nn2$d",
        "LBG$a;",
        "",
        "a",
        "()Z",
        "hasMoreContent",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:LNn2;

.field public final synthetic b:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lho2$a;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:I


# direct methods
.method public constructor <init>(LNn2;Lkotlin/jvm/internal/Ref$ObjectRef;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LNn2;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lho2$a;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, LNn2$d;->a:LNn2;

    iput-object p2, p0, LNn2$d;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput p3, p0, LNn2$d;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 3

    iget-object v0, p0, LNn2$d;->a:LNn2;

    iget-object v1, p0, LNn2$d;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lho2$a;

    iget v2, p0, LNn2$d;->c:I

    invoke-static {v0, v1, v2}, LNn2;->b(LNn2;Lho2$a;I)Z

    move-result v0

    return v0
.end method
