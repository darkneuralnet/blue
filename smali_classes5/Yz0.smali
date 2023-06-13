.class public final synthetic LYz0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LaA0;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LaA0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYz0;->b:LaA0;

    iput p2, p0, LYz0;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LYz0;->b:LaA0;

    iget v1, p0, LYz0;->c:I

    invoke-static {v0, v1}, LaA0;->p(LaA0;I)V

    return-void
.end method
