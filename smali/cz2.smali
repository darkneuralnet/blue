.class public final synthetic Lcz2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lez2;


# direct methods
.method public synthetic constructor <init>(Lez2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcz2;->b:Lez2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcz2;->b:Lez2;

    invoke-static {v0}, Lez2;->a(Lez2;)V

    return-void
.end method
