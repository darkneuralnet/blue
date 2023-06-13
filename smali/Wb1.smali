.class public final synthetic LWb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lsb1;

.field public final synthetic c:Lib1;


# direct methods
.method public synthetic constructor <init>(Lsb1;Lib1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWb1;->b:Lsb1;

    iput-object p2, p0, LWb1;->c:Lib1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LWb1;->b:Lsb1;

    iget-object v1, p0, LWb1;->c:Lib1;

    invoke-static {v0, v1}, LOb1$f;->e(Lsb1;Lib1;)V

    return-void
.end method
