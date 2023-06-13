.class public final synthetic LIb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LOb1;


# direct methods
.method public synthetic constructor <init>(LOb1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIb1;->b:LOb1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LIb1;->b:LOb1;

    invoke-static {v0}, LOb1;->r(LOb1;)V

    return-void
.end method
