.class public final synthetic LQ75;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:LY75;


# direct methods
.method public synthetic constructor <init>(ILY75;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LQ75;->b:I

    iput-object p2, p0, LQ75;->c:LY75;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, LQ75;->b:I

    iget-object v1, p0, LQ75;->c:LY75;

    invoke-static {v0, v1}, LY75;->pm(ILY75;)V

    return-void
.end method
