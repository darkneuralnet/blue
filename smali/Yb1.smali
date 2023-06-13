.class public final synthetic LYb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LOb1$f;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LOb1$f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYb1;->b:LOb1$f;

    iput p2, p0, LYb1;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LYb1;->b:LOb1$f;

    iget v1, p0, LYb1;->c:I

    invoke-static {v0, v1}, LOb1$f;->c(LOb1$f;I)V

    return-void
.end method
