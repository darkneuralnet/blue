.class public final synthetic Ljv1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfe3;


# instance fields
.field public final synthetic b:Ln74;


# direct methods
.method public synthetic constructor <init>(Ln74;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljv1;->b:Ln74;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ljv1;->b:Ln74;

    invoke-static {v0, p1}, Lkv1$a;->e(Ln74;Ljava/lang/Object;)V

    return-void
.end method
