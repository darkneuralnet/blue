.class public final synthetic LhQ3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:LiQ3;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LiQ3;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LhQ3;->a:LiQ3;

    iput-object p2, p0, LhQ3;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LhQ3;->a:LiQ3;

    iget-object v1, p0, LhQ3;->b:Ljava/lang/Object;

    invoke-static {v0, v1, p1}, LiQ3;->a(LiQ3;Ljava/lang/Object;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
