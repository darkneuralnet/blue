.class public final synthetic LmI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LOI;

.field public final synthetic c:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic d:[B


# direct methods
.method public synthetic constructor <init>(LOI;Lkotlin/jvm/internal/Ref$IntRef;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmI;->b:LOI;

    iput-object p2, p0, LmI;->c:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p3, p0, LmI;->d:[B

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LmI;->b:LOI;

    iget-object v1, p0, LmI;->c:Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v2, p0, LmI;->d:[B

    invoke-static {v0, v1, v2}, LOI;->J(LOI;Lkotlin/jvm/internal/Ref$IntRef;[B)V

    return-void
.end method
