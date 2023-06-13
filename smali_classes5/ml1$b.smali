.class public Lml1$b;
.super Lml1$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lml1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lml1$a<",
        "Landroid/os/ParcelFileDescriptor;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lml1$b$a;

    invoke-direct {v0}, Lml1$b$a;-><init>()V

    invoke-direct {p0, v0}, Lml1$a;-><init>(Lml1$d;)V

    return-void
.end method
