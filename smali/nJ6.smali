.class public final synthetic LnJ6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LoJ6;

.field public final synthetic c:LO80$a;

.field public final synthetic d:LqJ6;


# direct methods
.method public synthetic constructor <init>(LoJ6;LO80$a;LqJ6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LnJ6;->b:LoJ6;

    iput-object p2, p0, LnJ6;->c:LO80$a;

    iput-object p3, p0, LnJ6;->d:LqJ6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LnJ6;->b:LoJ6;

    iget-object v1, p0, LnJ6;->c:LO80$a;

    iget-object v2, p0, LnJ6;->d:LqJ6;

    invoke-static {v0, v1, v2}, LoJ6;->a(LoJ6;LO80$a;LqJ6;)V

    return-void
.end method
