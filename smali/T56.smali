.class public final synthetic LT56;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LU56;

.field public final synthetic c:LO80$a;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(LU56;LO80$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT56;->b:LU56;

    iput-object p2, p0, LT56;->c:LO80$a;

    iput-boolean p3, p0, LT56;->d:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LT56;->b:LU56;

    iget-object v1, p0, LT56;->c:LO80$a;

    iget-boolean v2, p0, LT56;->d:Z

    invoke-static {v0, v1, v2}, LU56;->a(LU56;LO80$a;Z)V

    return-void
.end method
