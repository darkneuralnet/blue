.class public final synthetic Lba6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lga6;


# direct methods
.method public synthetic constructor <init>(Lga6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba6;->b:Lga6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lba6;->b:Lga6;

    invoke-static {v0}, Lga6;->b(Lga6;)V

    return-void
.end method
