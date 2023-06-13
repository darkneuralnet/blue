.class public final synthetic LlJ6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:LoJ6;

.field public final synthetic b:LqJ6;


# direct methods
.method public synthetic constructor <init>(LoJ6;LqJ6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlJ6;->a:LoJ6;

    iput-object p2, p0, LlJ6;->b:LqJ6;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LlJ6;->a:LoJ6;

    iget-object v1, p0, LlJ6;->b:LqJ6;

    invoke-static {v0, v1, p1}, LoJ6;->c(LoJ6;LqJ6;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
