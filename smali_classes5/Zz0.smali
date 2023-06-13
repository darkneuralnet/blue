.class public final synthetic LZz0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:LaA0;


# direct methods
.method public synthetic constructor <init>(IILaA0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LZz0;->b:I

    iput p2, p0, LZz0;->c:I

    iput-object p3, p0, LZz0;->d:LaA0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, LZz0;->b:I

    iget v1, p0, LZz0;->c:I

    iget-object v2, p0, LZz0;->d:LaA0;

    invoke-static {v0, v1, v2}, LaA0;->o(IILaA0;)V

    return-void
.end method
