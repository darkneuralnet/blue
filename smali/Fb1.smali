.class public final synthetic LFb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LOb1;

.field public final synthetic c:LO80$a;


# direct methods
.method public synthetic constructor <init>(LOb1;LO80$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFb1;->b:LOb1;

    iput-object p2, p0, LFb1;->c:LO80$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LFb1;->b:LOb1;

    iget-object v1, p0, LFb1;->c:LO80$a;

    invoke-static {v0, v1}, LOb1;->k(LOb1;LO80$a;)V

    return-void
.end method
