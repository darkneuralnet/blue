.class public final synthetic LSC;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LXC;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LXC;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSC;->b:LXC;

    iput p2, p0, LSC;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LSC;->b:LXC;

    iget v1, p0, LSC;->c:I

    invoke-static {v0, v1}, LXC;->Ol(LXC;I)V

    return-void
.end method
