.class public Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler;
    .locals 0

    new-instance p1, Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler;

    invoke-direct {p1}, Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler;-><init>()V

    return-object p1
.end method

.method public b(I)[Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler;
    .locals 0

    new-array p1, p1, [Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler$a;->a(Landroid/os/Parcel;)Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler$a;->b(I)[Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler;

    move-result-object p1

    return-object p1
.end method
