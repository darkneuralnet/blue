.class public final synthetic LGV5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LMV5;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LMV5;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGV5;->b:LMV5;

    iput p2, p0, LGV5;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LGV5;->b:LMV5;

    iget v1, p0, LGV5;->c:I

    invoke-static {v0, v1}, LMV5;->a(LMV5;I)V

    return-void
.end method
