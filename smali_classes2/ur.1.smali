.class public final synthetic Lur;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ltr;


# direct methods
.method public synthetic constructor <init>(Ltr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lur;->b:Ltr;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lur;->b:Ltr;

    invoke-static {v0}, Ltr$e;->a(Ltr;)V

    return-void
.end method
