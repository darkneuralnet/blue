.class public final synthetic LC76;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5;


# instance fields
.field public final synthetic b:LF76;


# direct methods
.method public synthetic constructor <init>(LF76;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC76;->b:LF76;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LC76;->b:LF76;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, LF76;->N6(LF76;Landroid/net/Uri;)V

    return-void
.end method
