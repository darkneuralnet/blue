.class public final Lcom/stripe/android/view/PostalCodeEditText$special$$inlined$observable$1;
.super Lkotlin/properties/ObservableProperty;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/PostalCodeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/properties/ObservableProperty<",
        "Lcom/stripe/android/view/PostalCodeEditText$Config;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\t\u00b8\u0006\u0000"
    }
    d2 = {
        "kotlin/properties/Delegates$observable$1",
        "Lkotlin/properties/ObservableProperty;",
        "afterChange",
        "",
        "property",
        "Lkotlin/reflect/KProperty;",
        "oldValue",
        "newValue",
        "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 PostalCodeEditText.kt\ncom/stripe/android/view/PostalCodeEditText\n*L\n1#1,70:1\n27#2,5:71\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/PostalCodeEditText;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lcom/stripe/android/view/PostalCodeEditText;)V
    .locals 0

    iput-object p2, p0, Lcom/stripe/android/view/PostalCodeEditText$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-direct {p0, p1}, Lkotlin/properties/ObservableProperty;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public afterChange(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/KProperty<",
            "*>;",
            "Lcom/stripe/android/view/PostalCodeEditText$Config;",
            "Lcom/stripe/android/view/PostalCodeEditText$Config;",
            ")V"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/stripe/android/view/PostalCodeEditText$Config;

    check-cast p2, Lcom/stripe/android/view/PostalCodeEditText$Config;

    sget-object p1, Lcom/stripe/android/view/PostalCodeEditText$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/PostalCodeEditText$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-static {p1}, Lcom/stripe/android/view/PostalCodeEditText;->access$configureForUs(Lcom/stripe/android/view/PostalCodeEditText;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/stripe/android/view/PostalCodeEditText$special$$inlined$observable$1;->this$0:Lcom/stripe/android/view/PostalCodeEditText;

    invoke-static {p1}, Lcom/stripe/android/view/PostalCodeEditText;->access$configureForGlobal(Lcom/stripe/android/view/PostalCodeEditText;)V

    :goto_0
    return-void
.end method
