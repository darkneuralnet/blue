.class public final synthetic LXD;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LZD;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(LZD;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXD;->b:LZD;

    iput p2, p0, LXD;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LXD;->b:LZD;

    iget v1, p0, LXD;->c:I

    invoke-static {v0, v1}, LZD;->k(LZD;I)V

    return-void
.end method
