.class public final synthetic LwD0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic b:Ljava/text/Collator;


# direct methods
.method public synthetic constructor <init>(Ljava/text/Collator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LwD0;->b:Ljava/text/Collator;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LwD0;->b:Ljava/text/Collator;

    check-cast p1, Lco/bird/android/model/Country;

    check-cast p2, Lco/bird/android/model/Country;

    invoke-static {v0, p1, p2}, LxD0;->t8(Ljava/text/Collator;Lco/bird/android/model/Country;Lco/bird/android/model/Country;)I

    move-result p1

    return p1
.end method
