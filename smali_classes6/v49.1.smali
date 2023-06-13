.class public final Lv49;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LD49;


# direct methods
.method public constructor <init>(LD49;LXO8;)V
    .locals 0

    iput-object p1, p0, Lv49;->b:LD49;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv49;->b:LD49;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LD49;->Q(LD49;LXO8;)V

    return-void
.end method
